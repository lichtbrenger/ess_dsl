/**
 * generated by Xtext 2.25.0
 */
package game.of.life;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class LifeDslStandaloneSetup extends LifeDslStandaloneSetupGenerated {
  public static void doSetup() {
    new LifeDslStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}