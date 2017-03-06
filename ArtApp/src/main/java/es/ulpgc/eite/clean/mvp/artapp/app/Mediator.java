package es.ulpgc.eite.clean.mvp.artapp.app;

import es.ulpgc.eite.clean.mvp.artapp.dummy.Dummy;
import es.ulpgc.eite.clean.mvp.artapp.hello.Hello;

public interface Mediator {
  void startingDummyScreen(Dummy.ToDummy presenter);

  void startingHelloScreen(Hello.ToHello presenter);
}
