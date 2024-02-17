package oops.classesandobjects.singletonpattern;

public class AppConfig {
  private AppConfig() {
  }
  //private static AppConfig obj = new AppConfig();
  
  private static AppConfig instance = null;
  public static AppConfig getInstance() {
	  if(instance == null) {
		  instance = new AppConfig();
	  }
	  return instance;
  }
}
