import com.intuit.karate.KarateOptions;
import org.junit.BeforeClass;
import org.springframework.context.annotation.Configuration;


@Configuration
@KarateOptions(features = "classpath:FeatureFiles/karateConfig.feature")
public class PagesRunner {

    @BeforeClass
    public static void before() {
        System.setProperty("karate.env", "dev");
    }
}
