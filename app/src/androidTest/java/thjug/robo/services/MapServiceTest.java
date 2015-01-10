package thjug.robo.services;

import android.test.InstrumentationTestCase;

import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

import retrofit.RestAdapter;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * http://maps.googleapis.com/maps/api/elevation/json?locations=15.119359,104.909965&sensor=true
 *
 * @author nuboat
 */
public class MapServiceTest extends InstrumentationTestCase {

    public void testService() {
        final RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("https://maps.googleapis.com")
                .build();

        final MapsService service = restAdapter.create(MapsService.class);
        final LinkedTreeMap result = service.findElevation("15.119359,104.909965", "true");

        assertThat(result.get("status").toString(), equalTo("OK"));
    }

}
