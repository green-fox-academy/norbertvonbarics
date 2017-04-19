import java.lang.annotation.*;


@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Monitor {
  String classification() default "TFT";
  String aspectratio() default "4:3";
}

enum Size {INCH15, INCH17, INCH19, INCH21, INCH23, INCH25, INCH29, INCH34}

@Monitor
public class Screen {
  int height;
  int width;

  Screen(int height, int width) {
    this.height = height;
    this.width = width;
  }
}
