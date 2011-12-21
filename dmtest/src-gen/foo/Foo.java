package foo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Foo {
  @Id
  private int id;
  
  public int getId() {
    return this.id;
  }
  
  public void setId( final int id) {
    this.id = id;
  }
  
  private String bla;
  
  public String getBla() {
    return this.bla;
  }
  
  public void setBla( final String bla) {
    this.bla = bla;
  }
}
