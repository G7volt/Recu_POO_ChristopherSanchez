package Repository;

import Entity.EntityActores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoActores extends JpaRepository<EntityActores, Long> {
}
