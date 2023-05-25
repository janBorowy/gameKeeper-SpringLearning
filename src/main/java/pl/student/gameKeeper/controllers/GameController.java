package pl.student.gameKeeper.controllers;

import lombok.AllArgsConstructor;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.EntityModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.student.gameKeeper.pojos.Game;

@AllArgsConstructor
@RequestMapping(value = "/game", produces = "application/json")
public class GameController extends GenericController<Game> {

    @Override
    public CollectionModel<EntityModel<Game>> all() {

    }

    @Override
    public ResponseEntity<Game> newEntity(@RequestBody Game entity){

    }

    @Override
    public EntityModel<Game> one(@PathVariable Long id){

    }

    @Override
    public ResponseEntity<Game> update(@RequestBody Game newEntity, @PathVariable Long id){

    }

    @Override
    public ResponseEntity<Game> delete(@PathVariable Long id){

    }

}
