/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 * Класс позволяюий раскрашивать текст в консоли и прочие действия с консолью
 * @author Vladislav
 */
class ColorKonsol {
    // Без атрибута жирного текста
    static final String BLACK = "\033[0;30m";
    static final String RED = "\033[0;31m";
    static final String GREEN = "\033[0;32m";
    static final String BROWN = "\033[0;33m";
    static final String BLUE = "\033[0;34m";
    static final String PURPLE = "\033[0;35m";
    static final String TURQUOISE = "\033[0;36m";
    static final String LIGHT_GRAY = "\033[0;37m";
    // С атрибутом жирного текста
    static final String DARK_GREY = "\033[1;30m";
    static final String LIGHT_RED = "\033[1;31m";
    static final String LIGHT_GREEN = "\033[1;32m";
    static final String YELLOW = "\033[1;33m";
    static final String LIGHT_BLUE = "\033[1;34m";
    static final String LIGHT_PURPLE = "\033[1;35m";
    static final String LIGHT_TURQUOISE = "\033[1;36m";
    static final String WHITE = "\033[1;37m";
    
    static final String RANDOM = "\033[38;2;20;20;50m";
    
    static final String RESET = "\033[0m";
}
