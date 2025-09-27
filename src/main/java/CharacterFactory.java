import characters.Character;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import org.reflections.Reflections;
import java.lang.reflect.Modifier;

public final class CharacterFactory  {

    @SneakyThrows
    public static Character createCharacter(){

        Reflections reflections = new Reflections("characters");
        Random randomizer = new Random();
        Set<Class<? extends Character>> all_character_sub_types = reflections.getSubTypesOf(Character.class);
        List<Class< ? extends Character>> concrete_types = new ArrayList<>(all_character_sub_types);
        concrete_types.removeIf(c -> Modifier.isAbstract(c.getModifiers()));

        Class<? extends Character> random_character = concrete_types.get(randomizer.nextInt(concrete_types.size()));

        return random_character.getConstructor().newInstance();
    }
}
