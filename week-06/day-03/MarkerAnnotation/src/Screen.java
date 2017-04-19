import java.lang.annotation.*;


@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Monitor {
  String type() default "TFT";
  String aspectratio() default "4:3";
}

@Monitor
public class Screen {
  int height;
  int width;

  Screen(int height, int width) {
    this.height = height;
    this.width = width;
  }
}
