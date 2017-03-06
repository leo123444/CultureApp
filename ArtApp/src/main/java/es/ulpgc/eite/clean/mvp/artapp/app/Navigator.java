package es.ulpgc.eite.clean.mvp.artapp.app;

import es.ulpgc.eite.clean.mvp.artapp.dummy.Dummy;
import es.ulpgc.eite.clean.mvp.artapp.hello.Hello;

public interface Navigator {
  void goToNextScreen(Dummy.DummyTo presenter);

  void goToByeScreen(Hello.HelloToBye presenter);
}
