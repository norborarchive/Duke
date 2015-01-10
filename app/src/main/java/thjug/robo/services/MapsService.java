package thjug.robo.services;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * https://maps.googleapis.com/maps/api/elevation/json?locations=15.119359,104.909965&sensor=true
 *
 * @author nuboat on 1/10/15.
 */

public interface MapsService {

    @GET("/maps/api/elevation/json")
    LinkedTreeMap findElevation(@Query("locations") final String locations, @Query("sensor") final String sensor);

}
