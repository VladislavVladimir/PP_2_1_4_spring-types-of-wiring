package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Egg6 getEgg(Needle7 needle) {
        return new Egg6(needle);
    }

    @Bean
    Deth8 getDeth8() {
        String[] lastWords = {
                "Твоя победа — лишь мимолетная иллюзия!",
                "Ты не сможешь избавиться от моего проклятия!",
                "О, нет! Ты не достоин победы!",
                "Как ты смеешь радоваться моей гибели?",
                "Я отомщу тебе на том свете!",
                "Может, я падаю, но ты тоже отправишься со мной.",
                "Я вернусь, и тогда тебе не поздоровится!",
                "Моя ненависть будет жить после меня!"
        };

        Random random = new Random();
        return new Deth8(lastWords[random.nextInt(lastWords.length)]);
    }
}
