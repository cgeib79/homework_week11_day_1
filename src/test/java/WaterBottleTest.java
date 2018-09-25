import org.junit.Before;
import org.junit.Test;


    public class WaterBottleTest {


        @Before
        public void before() {
            WaterBottle = new WaterBottle(100);
        }


        @Test
        public void drink() {
            int drink = WaterBottle.drink(100);
            assertEquals(95);
        }

        @Test void currentVolume(){
            int currentVolume = WaterBottle.getCurrentVolume(95);
            assertEquals(95);
        }

        @Test void empty(){
            int empty = WaterBottle.empty(100){
                assertEquals(0);
            }

            @Test void fill(){
                int fill = WaterBottle.fill(100){
                    assertEquals(100);
                }
            }
        }
    }