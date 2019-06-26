package com.yuwei.volte.util;

import ch.hsr.geohash.GeoHash;

/**
 * Created by IBM on 2018/5/20.
 */
public class GeoHashUtils {
    private static int GEOHASHLEN = 12;
    public static String getGeoHashByPoint(double longitude,double latitude){
        // 经度
        //double longitude = 114.10183699999999;
        // 纬度
        //double latitude = 22.567774000150113;
        // 算出当关geoHasH
        GeoHash geoHash = GeoHash.withCharacterPrecision(latitude, longitude,GEOHASHLEN);
        return geoHash.toBase32();
    }
}
