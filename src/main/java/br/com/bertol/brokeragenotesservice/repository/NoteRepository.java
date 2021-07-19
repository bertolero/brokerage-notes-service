package br.com.bertol.brokeragenotesservice.repository;

import br.com.bertol.brokeragenotesservice.model.Note;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "note", path = "note")
public interface NoteRepository extends CrudRepository<Note, Long> {
}
