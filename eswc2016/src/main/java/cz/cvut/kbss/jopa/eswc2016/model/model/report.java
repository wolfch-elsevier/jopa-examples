
package cz.cvut.kbss.jopa.eswc2016.model.model;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.CommonVocabulary;
import cz.cvut.kbss.jopa.eswc2016.model.Vocabulary;
import cz.cvut.kbss.jopa.model.annotations.*;


/**
 * This class was generated by the OWL2Java tool version 0.4
 * 
 */
@OWLClass(iri = Vocabulary.s_c_report)
public class report {

    @OWLAnnotationProperty(iri = CommonVocabulary.RDFS_LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = CommonVocabulary.DC_DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Id(generated = true)
    protected String id;
    @Properties(fetchType = FetchType.EAGER)
    protected Map<String, Set<String>> properties;
    @OWLObjectProperty(iri = Vocabulary.s_p_has_documentation_part, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    protected Set<logical_record> has_documentation_part;
    @OWLObjectProperty(iri = Vocabulary.s_p_hasAuthor)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Person_A_A_A, max = 1)
    })
    protected Person hasAuthor;
    @OWLObjectProperty(iri = Vocabulary.s_p_documents, fetch = FetchType.EAGER)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Event, min = 1, max = 1)
    })
    protected Event documents;
    @OWLDataProperty(iri = Vocabulary.s_p_created)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_d_dateTime, max = 1)
    })
    protected Date created;
    @OWLDataProperty(iri = Vocabulary.s_p_identifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_d__long, min = 1, max = 1)
    })
    protected Long identifier;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    public void setHas_documentation_part(Set<logical_record> has_documentation_part) {
        this.has_documentation_part = has_documentation_part;
    }

    public Set<logical_record> getHas_documentation_part() {
        return has_documentation_part;
    }

    public void setHasAuthor(Person hasAuthor) {
        this.hasAuthor = hasAuthor;
    }

    public Person getHasAuthor() {
        return hasAuthor;
    }

    public void setDocuments(Event documents) {
        this.documents = documents;
    }

    public Event getDocuments() {
        return documents;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    public Long getIdentifier() {
        return identifier;
    }

}
