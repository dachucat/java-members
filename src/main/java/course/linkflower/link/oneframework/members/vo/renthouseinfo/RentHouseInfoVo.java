package course.linkflower.link.oneframework.members.vo.renthouseinfo;

import course.linkflower.link.oneframework.members.model.RentHouseInfo;
import lombok.Data;

@Data
public class RentHouseInfoVo {
    private String id;
    private String clientId;
    private String agentId;
    private String communityInfoId;
    private String depositTypeId;
    private String commissionId;
    private String rentHouseTypeId;
    private String decorateTypeId;
    private String orientationId;
    private String storeyId;
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

    public RentHouseInfoVo loadFrom(RentHouseInfo r){
        if (r != null){
            id = String.valueOf(r.getId());
            clientId = String.valueOf(r.getClientId());
            agentId = String.valueOf(r.getAgentId());
            communityInfoId = String.valueOf(r.getCommunityInfoId());
            depositTypeId = String.valueOf(r.getDepositTypeId());
            commissionId = String.valueOf(r.getCommissionId());
            rentHouseTypeId = String.valueOf(r.getRentHouseTypeId());
            decorateTypeId = String.valueOf(r.getDecorateTypeId());
            orientationId = String.valueOf(r.getOrientationId());
            storeyId = String.valueOf(r.getStoreyId());
            propertyPrice = r.getPropertyPrice();
            houseSize = r.getHouseSize();
            bedroom = r.getBedroom();
            livingroom = r.getLivingroom();
            washroom = r.getWashroom();
            rent = r.getRent();
            status = r.getStatus();
            level = r.getLevel();
            houseDescription = r.getHouseDescription();
            picture = r.getPicture();
            video = r.getVideo();
            title = r.getTitle();
            address = r.getAddress();
        }
        return this;
    }
}
