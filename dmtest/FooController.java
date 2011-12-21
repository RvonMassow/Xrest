package foo;

import foo.Foo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("foo/foo")
public class FooController {
	@PersistenceUnit
	EntityManagerFactory emf;
  @GET
  @Produces("application/json")
  public Foo getFooAsJSON(@PathParam("id") final int id) {
	  EntityManager entityManager = emf.createEntityManager();
	  Foo foo = entityManager.find(Foo.class, id);
	  return foo;
  }
}
