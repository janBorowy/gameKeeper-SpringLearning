package pl.student.gameKeeper.controllers;

import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

@RestController
public interface GenericController<T> {

    public CollectionModel<EntityModel<T>> all();

    public ResponseEntity<T> newEntity(@RequestBody T entity);

    public EntityModel<T> one(@PathVariable Long id);

    public ResponseEntity<T> update(@RequestBody T newEntity, @PathVariable Long id);

    public ResponseEntity<T> delete(@PathVariable Long id);
}
