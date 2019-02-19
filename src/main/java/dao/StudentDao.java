package dao;

import entity.StudentInfo;

import java.util.List;

/**
 * Created by Administrator on 2019/1/12/012.
 */
public interface  StudentDao {
    List<StudentInfo> selectAll();
    StudentInfo selectById(Integer id);
    int update(StudentInfo studentInfo);
}
