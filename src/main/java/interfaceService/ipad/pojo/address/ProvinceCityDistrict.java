package interfaceService.ipad.pojo.address;

/**
 * Created by Administrator on 2017/8/8.
 * 省市区实体
 */
public class ProvinceCityDistrict {
    private String name;
    private String val;
    private String type;
    private String parentId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
