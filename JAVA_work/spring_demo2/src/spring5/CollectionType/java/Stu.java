import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    //3大数据结构属性
    private String[] cource;
    private List[] list;
    private Map<String,String> maps;
    private Set<String> sets;

    public void setCource(String[] cource) {
        this.cource = cource;
    }

    public void setList(List[] list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    //学生所学的多门的课程
    private List<Course> coursesList;

    public void setCoursesList(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    public void test(){
        System.out.println(Arrays.toString(cource));
        System.out.println(Arrays.toString(list));
        System.out.println(maps);
        System.out.println(sets);
    }
}
