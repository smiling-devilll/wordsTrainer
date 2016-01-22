import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.atc.wordsTrainer.system.Main;
import ru.atc.wordsTrainer.entities.Word;
import ru.atc.wordsTrainer.translation.YandexTranslator;

/**
 * Created by VTestova on 04.12.2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
@ComponentScan("ru.atc.wordsTrainer.translation")
@WebAppConfiguration
public class TranslationTest {

    @Autowired
    YandexTranslator yandexTranslator;

    @Test
    public void test(){

        String word = "мир";
        Word translation = yandexTranslator.translate(word);

        Assert.assertEquals(
                 "world", translation.getTranslation().toLowerCase());
    }
}
