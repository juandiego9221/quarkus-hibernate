package pe.com.jdmm21;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import pe.com.jdmm21.controller.GreetingControllerTest;

@QuarkusIntegrationTest
public class GreetingResourceIT extends GreetingControllerTest {
    // Execute the same tests but in packaged mode.
}
