package pe.com.jdmm21;

import io.quarkus.test.junit.QuarkusIntegrationTest;
import pe.com.jdmm21.controller.MovieControllerTest;

@QuarkusIntegrationTest
public class MovieResourceIT extends MovieControllerTest {
    // Execute the same tests but in packaged mode.
}
