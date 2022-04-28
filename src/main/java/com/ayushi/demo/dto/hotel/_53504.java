
package com.ayushi.demo.dto.hotel;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class _53504 {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("centerLat")
    @Expose
    private Double centerLat;
    @SerializedName("centerLon")
    @Expose
    private Double centerLon;
    @SerializedName("viewOrder")
    @Expose
    private Integer viewOrder;
    @SerializedName("polygonPoints")
    @Expose
    private List<PolygonPoint> polygonPoints = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCenterLat() {
        return centerLat;
    }

    public void setCenterLat(Double centerLat) {
        this.centerLat = centerLat;
    }

    public Double getCenterLon() {
        return centerLon;
    }

    public void setCenterLon(Double centerLon) {
        this.centerLon = centerLon;
    }

    public Integer getViewOrder() {
        return viewOrder;
    }

    public void setViewOrder(Integer viewOrder) {
        this.viewOrder = viewOrder;
    }

    public List<PolygonPoint> getPolygonPoints() {
        return polygonPoints;
    }

    public void setPolygonPoints(List<PolygonPoint> polygonPoints) {
        this.polygonPoints = polygonPoints;
    }

}
