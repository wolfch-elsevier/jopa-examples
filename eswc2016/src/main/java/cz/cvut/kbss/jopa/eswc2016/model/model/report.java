
package cz.cvut.kbss.jopa.eswc2016.model.model;

import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.CommonVocabulary;
import cz.cvut.kbss.jopa.eswc2016.model.Vocabulary;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;


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
    @Properties
    protected Map<String, Set<String>> properties;
    @OWLObjectProperty(iri = Vocabulary.s_p_has_documentation_part)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_logical_record, min = 1)
    })
    protected Set<Thing> has_documentation_part;
    @OWLObjectProperty(iri = Vocabulary.s_p_hasAuthor)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Person, min = 1, max = 1)
    })
    protected Set<Thing> hasAuthor;
    @OWLObjectProperty(iri = Vocabulary.s_p_documents)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Event, min = 1, max = 1)
    })
    protected Set<Thing> documents;

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

    public void setHas_documentation_part(Set<Thing> has_documentation_part) {
        this.has_documentation_part = has_documentation_part;
    }

    public Set<Thing> getHas_documentation_part() {
        return has_documentation_part;
    }

    public void setHasAuthor(Set<Thing> hasAuthor) {
        this.hasAuthor = hasAuthor;
    }

    public Set<Thing> getHasAuthor() {
        return hasAuthor;
    }

    public void setDocuments(Set<Thing> documents) {
        this.documents = documents;
    }

    public Set<Thing> getDocuments() {
        return documents;
    }

}
