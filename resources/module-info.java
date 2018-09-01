open module org.springframework.samples.petclinic {
    requires java.xml.bind;
    requires java.management;
    requires java.transaction;

    requires java.activation;
    requires java.instrument;
    requires java.persistence;
    requires java.sql;
    requires java.validation;
    requires jdk.unsupported;

//    requires hibernate.jpa;
    requires org.hibernate.validator;

    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.tx;
    requires spring.web;
    requires spring.webmvc;
    requires spring.data.commons;
    requires spring.data.jpa;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires cache.api;
/*
    exports org.springframework.samples.petclinic;
    exports org.springframework.samples.petclinic.model;
    exports org.springframework.samples.petclinic.owner;
    exports org.springframework.samples.petclinic.system;
    exports org.springframework.samples.petclinic.vet;
    exports org.springframework.samples.petclinic.visit;
*/
}
