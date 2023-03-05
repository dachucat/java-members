package course.linkflower.link.oneframework.members.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@TableName("rent_house_info")
public class RentHouseInfo {
    private long id;
    private long clientId;
    private long agentId;
    private long communityInfoId;
    private long depositTypeId;
    private long commissionId;
    private long rentHouseTypeId;
    private long decorateTypeId;
    private long orientationId;
    private long storeyId;
    private double propertyPrice;
    private double houseSize;
    private int bedroom;
    private int livingroom;
    private int washroom;
    private int rent;
    private int status;
    private int level;
    private String houseDescription;
    private String picture;
    private String video;
    private String title;
    private String address;
}
