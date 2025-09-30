import characters.Character;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;

public final class CharacterFactory  {

    static private Random randomizer = new Random();
    static private Reflections reflections = new Reflections("characters");

    @SneakyThrows
    public static Character createCharacter(){

        Set<Class<? extends Character>> all_character_sub_types = reflections.getSubTypesOf(Character.class);
        List<Class< ? extends Character>> concrete_types = new ArrayList<>(all_character_sub_types);

        return concrete_types.get(randomizer.nextInt(concrete_types.size())).getConstructor().newInstance();
    }
}
