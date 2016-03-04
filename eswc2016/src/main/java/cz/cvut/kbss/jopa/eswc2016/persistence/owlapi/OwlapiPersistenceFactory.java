package cz.cvut.kbss.jopa.eswc2016.persistence.owlapi;

import com.clarkparsia.pellet.owlapiv3.PelletReasonerFactory;
import cz.cvut.kbss.jopa.eswc2016.persistence.BasePersistenceFactory;
import cz.cvut.kbss.jopa.model.EntityManagerFactory;
import cz.cvut.kbss.jopa.model.JOPAPersistenceProperties;
import cz.cvut.kbss.ontodriver.config.OntoDriverProperties;
import cz.cvut.kbss.ontodriver.owlapi.config.OwlapiOntoDriverProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.HashMap;
import java.util.Map;

/**
 * Persistence configuration for the OWL API storage.
 */
@Configuration
@PropertySource("classpath:owlapi.properties")
public class OwlapiPersistenceFactory extends BasePersistenceFactory {

    private static final String ONTOLOGY_URI_PARAM = "owlapi.ontologyUri";
    private static final String URL_PROPERTY = "owlapi.repositoryUrl";
    private static final String DRIVER_PROPERTY = "owlapi.driver";
    private static final String MAPPING_FILE = "owlapi.mappingFile";

    @Bean(name = "owlapiEMF")
    public EntityManagerFactory entityManagerFactory() {
        return getEmf();
    }

    @Override
    protected String getType() {
        return "owlapi";
    }

    @Override
    protected Map<String, String> getProperties() {
        final Map<String, String> properties = new HashMap<>();
        // Logical ontology URI, required by OWLAPI
        properties.put(JOPAPersistenceProperties.ONTOLOGY_URI_KEY, environment.getProperty(ONTOLOGY_URI_PARAM));
        properties.put(JOPAPersistenceProperties.ONTOLOGY_PHYSICAL_URI_KEY, environment.getProperty(URL_PROPERTY));
        properties.put(JOPAPersistenceProperties.DATA_SOURCE_CLASS, environment.getProperty(DRIVER_PROPERTY));
        properties.put(OwlapiOntoDriverProperties.MAPPING_FILE_LOCATION, environment.getProperty(MAPPING_FILE));
        // Pellet for reasoning
        properties.put(OntoDriverProperties.OWLAPI_REASONER_FACTORY_CLASS, PelletReasonerFactory.class.getName());
        return properties;
    }
}
