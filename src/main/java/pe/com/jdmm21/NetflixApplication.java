package pe.com.jdmm21;

import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@OpenAPIDefinition(tags = {
        @Tag(name = "Category", description = "Operations related to categories")

}, info = @Info(title = "Netflix API", version = "1.0.0", description = "Netflix API", contact = @Contact(name = "jdmm", email = "example@gmail.com")))
public class NetflixApplication extends Application {

}
