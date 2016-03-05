package cz.cvut.kbss.jopa.eswc2016.rest;

import cz.cvut.kbss.jopa.eswc2016.model.model.Question;
import cz.cvut.kbss.jopa.eswc2016.rest.exception.NotFoundException;
import cz.cvut.kbss.jopa.eswc2016.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionController extends BaseController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Question> getQuestions() {
        return questionService.findAll();
    }

    @RequestMapping(value = "/{key}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Question getQuestion(@PathVariable("key") Long key) {
        return getQuestionInternal(key);
    }

    private Question getQuestionInternal(Long key) {
        final Question q = questionService.findByKey(key);
        if (q == null) {
            throw NotFoundException.create("Question", key);
        }
        return q;
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Void> createQuestion(@RequestBody Question question) {
        questionService.persist(question);
        if (LOG.isTraceEnabled()) {
            LOG.trace("Question " + question + " successfully created.");
        }
        final HttpHeaders header = RestUtils.createLocationHeader("/{key}", question.getIdentifier());
        return new ResponseEntity<>(header, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/{key}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateQuestion(@PathVariable("key") Long key, @RequestBody Question update) {
        final Question original = getQuestionInternal(key);
        assert original.getId().equals(update.getId());
        questionService.update(update);
        if (LOG.isTraceEnabled()) {
            LOG.trace("Question {} successfully updated.", update.getId());
        }
    }
}
