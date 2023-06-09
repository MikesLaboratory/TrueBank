/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 3, 29 June 2007
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package it.mikeslab.util.language;

import java.util.Arrays;

/**
 * The enum Recognized languages.
 */
public enum RecognizedLanguages {
    /**
     * En us recognized languages.
     */
    en_US,
    /**
     * It it recognized languages.
     */
    it_IT,
    /**
     * Es es recognized languages.
     */
    es_ES,
    /**
     * Fr fr recognized languages.
     */
    fr_FR;

    /**
     * Get languages string [ ].
     *
     * @return the string [ ]
     */
    public static String[] getLanguages() {
        return Arrays.stream(RecognizedLanguages.values()).map(Enum::name).toArray(String[]::new);
    }

    /**
     * Is recognized language boolean.
     *
     * @param language the language
     * @return the boolean
     */
    public static boolean isRecognizedLanguage(String language) {
        for(RecognizedLanguages recognizedLanguage : RecognizedLanguages.values()) {
            if(recognizedLanguage.name().equals(language)) {
                return true;
            }
        }

        return false;
    }
}
