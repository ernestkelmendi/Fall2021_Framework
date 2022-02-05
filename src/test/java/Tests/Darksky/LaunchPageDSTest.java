package Tests.Darksky;

import Helper.Check;
import Helper.Misc;
import Pages.Darksky.LaunchPageDS;
import Web.UseDriver;
import org.testng.annotations.Test;

public class LaunchPageDSTest {

    LaunchPageDS lp = new LaunchPageDS();

    @Test
    public void verifyFeelsLikeTempValue() {

        /*Verify feelsLike-tempValue is in between low-tempValue and high-tempValue
         */
        lp.launchDarksky();

        int feelsLikeTemp = lp.getFeelsLikeTemp();
        //System.out.println(feelsLikeTemp);

        int lowTemp = lp.getLowTemp();
        //System.out.println(lowTemp);

        int highTemp = lp.getHighTemp();
        //System.out.println(highTemp);

        boolean temp_in_between = ((feelsLikeTemp < highTemp) && (feelsLikeTemp > lowTemp));

        Check.checkTrue(temp_in_between, "feels like temp is not between Low and High Temp");

        UseDriver.quitWebPages();
    }

    @Test
    public void verifyCurrentTempIsCorrect() {

        /*Verify current-temp is displayed correctly when user changes temp-unit
         */
        lp.launchDarksky();

        Misc.sleep(2);

        lp.getCurrent_tempFValue();
        double tempF = Double.valueOf(lp.getCurrent_tempFValue());

        lp.toChange_from_F_to_C();

        Misc.sleep(2);

        lp.getCurrent_tempCValue();

        int temC = Integer.valueOf(lp.getCurrent_tempCValue());

        double tempC=(tempF - 32)*5/9;

        int tC = (int)Math.round(tempC);

        Check.checkEquals(temC, tC, "failed");

        lp.quitDarkSky();

    }

}
