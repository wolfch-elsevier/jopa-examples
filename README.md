# JOPA Examples

This repository contains some usage examples of the [JOPA framework](https://github.com/kbss-cvut/jopa) - a persistence library
for Semantic Web data (both RDF and OWL).

### Examples

1. **Example01** - JOPA with a Sesame in-memory storage, working with object model generated by OWL2Java.
2. **Example02** - JOPA using OWLAPI-accessed files as storage.
3. **Example03** - JOPA with a native Sesame storage utilizing its contexts to store and access data in different RDF named graphs.
4. **Example04** - Full-blown Java web application with Spring, REST services, ReactJS-based UI and JOPA with Sesame native storage. 
Declarative transactions included. Lombok is used to generate boilerplate entity code.
5. **Example05** - JOPA utilizing [OWL2Query](https://kbss.felk.cvut.cz/web/portal/owl2query) - a SPARQL-DL query engine for OWLAPI.
6. **eswc2016** - JOPA demo for the ESWC 2016 conference. A running version can be found at 
[http://kbss.felk.cvut.cz/jopa-eswc-demo/](http://kbss.felk.cvut.cz/jopa-eswc-demo/).
7. **Example06** - JOPA showcasing support for mapped superclasses and plain identifier object property values.
8. **JOPA JSON-LD** - JOPA with [JB4JSON-LD](https://github.com/kbss-cvut/jb4jsonld) for Jackson and Spring - 
serialization/deserialization of POJOs into/from JSON-LD. Also, showcases declarative transaction support for JOPA and Spring.
9. **Example07** - JOPA demonstrating support for single inheritance and plural data properties.
10. **Example08** - JOPA using the Jena OntoDriver and demonstrating support for polymorphism in the object model. 
It is a Spring Boot application, uses declarative transactions and JSON-LD.
11. **Example09** - JOPA with the [Semantic Object Query Language](https://github.com/kbss-cvut/jopa/wiki/Semantic-Object-Query-Language)
 support. It is a Spring Boot application, uses autowiring of JOPA `EntityManager`, and produces JSON-LD.

Each example has its own README file with a more detailed description. Note that JOPA requires Java 8. To be able to use
later versions of Java, see branch [java-11](https://github.com/kbss-cvut/jopa-examples/tree/java-11).

#### Additional Examples

##### Reporting Tool

An example of a more complex application using JOPA as its persistence provider can be found at 
[https://github.com/kbss-cvut/reporting-tool](https://github.com/kbss-cvut/reporting-tool).

##### TermIt

TermIt is a Spring-based web application. It uses declarative transactions, heavily relies on repository contexts, and its 
REST services consume/produce JSON-LD. JOPA is used as a persistence provider.

It is the most complex JOPA-based application developed by us to-date.

Sources are available on GitHub:
* Backend: [https://github.com/kbss-cvut/termit](https://github.com/kbss-cvut/termit)
* Frontend: [https://github.com/kbss-cvut/termit-ui](https://github.com/kbss-cvut/termit-ui)
