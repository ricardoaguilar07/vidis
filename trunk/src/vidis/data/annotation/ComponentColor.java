package vidis.data.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.annotation.processing.SupportedOptions;

/**
 * Die Annotation ComponentColor ist optional und beschreibt welchen
 * grundfarbton ein element haben soll.
 * 
 * @author dominik
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ComponentColor {
	/**
	 * Die farbe dieser Komponente
	 */
	ColorType color();
}