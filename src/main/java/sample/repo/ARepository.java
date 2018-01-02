package sample.repo;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.EntityGraph.EntityGraphType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sample.model.A;

@Repository
public interface ARepository extends JpaRepository<A, Long> {
    @EntityGraph(value="A.fetchB", type=EntityGraphType.FETCH)
    A findAFetchBById(Long id);
}
