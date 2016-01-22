import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import ru.atc.wordsTrainer.entities.Word;
import ru.atc.wordsTrainer.services.WordService;
import ru.atc.wordsTrainer.system.Main;

/**
 * Created by VTestova on 07.12.2015.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Main.class)
@ComponentScan("ru.atc.wordsTrainer.services")
@WebAppConfiguration
public class TestWordsSaving {
    @Autowired
    WordService wordService;

    @Test
    public void testSaving(){
        Word wrd = new Word();
        wrd.setOriginal("мир");
        wrd.setTranslation("world");
        wordService.save(wrd);

    }
}
