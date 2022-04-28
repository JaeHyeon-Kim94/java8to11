package Gof.구조관련디자인패턴.바_플라이웨이트패턴._02_after;

import java.util.HashMap;
import java.util.Map;

//flyweight factory
public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font){
        if(cache.containsKey(font)){
            return cache.get(font);
        }else{
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }

}
