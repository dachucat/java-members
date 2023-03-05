package course.linkflower.link.oneframework.members.dao;

import course.linkflower.link.oneframework.db.mapper.SuperMapper;
import course.linkflower.link.oneframework.members.dto.carbrand.CarBrandNoIdDto;
import course.linkflower.link.oneframework.members.model.CarBrand;
import course.linkflower.link.oneframework.members.vo.carbrand.CarBrandNoIdVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarBrandMapper extends SuperMapper<CarBrandMapper> {
    int add(CarBrand carBrand);

    int deleteById(@Param("id") long id);

    int update(CarBrand carBrand);

    CarBrandNoIdVo getCarBrandById(@Param("id") long id);

    List<CarBrandNoIdVo> listNameByCarCompanyId(@Param("id") long id);

    int countSameIcon(@Param("icon") String icon);


    long getIdByIcon(@Param("icon") String icon);

    String getNameById(@Param("id") long id);

    long getCarCompanyIdById(@Param("id") long id);
}
