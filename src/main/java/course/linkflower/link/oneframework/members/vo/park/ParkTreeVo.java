package course.linkflower.link.oneframework.members.vo.park;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class ParkTreeVo {
    private String id;
    private String name;
    private String  parentId;
    private String icon;
    private String code;
    private String  ordering;
    private byte type;
    private String introduction;
    private String barcode;
    public List<ParkTreeVo> childs=new ArrayList<>();
    public static ParkTreeVo loadFromList(List<ParkTreeVo> ptVos) {
//        将park中所有id与对应的row放入map
        if (ptVos.size() > 0) {
            Map<String, ParkTreeVo> lptbcvoMap = new HashMap<>();
            for (ParkTreeVo l : ptVos) {
                lptbcvoMap.put(l.getId(), l);
            }
//        将子对象装进父对象的集合里
            ParkTreeVo maxAspect = null;
            for (ParkTreeVo l : ptVos) {
                ParkTreeVo parent = lptbcvoMap.get(l.getParentId());
                if (parent != null) {
                    parent.childs.add(l);
                } else {
                    maxAspect = l;
                }
            }
            return maxAspect;
        }
        return null;
    }
}
