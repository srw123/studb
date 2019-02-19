package dao.impl;

import dao.BaseDao;
import dao.StudentDao;
import entity.StudentInfo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2019/1/12/012.
 */
public class StudentDaoImpl extends BaseDao implements StudentDao {
    @Override
    public List<StudentInfo> selectAll() {
        List<StudentInfo> list=new ArrayList<>();
        String sql="select sid,sname,sgender,sage,saddress,semail from StudentInfo";
        getConn();
        try {
            pata=conn.prepareStatement(sql);
            rs=pata.executeQuery();
            while (rs.next()){
                StudentInfo studentInfo=new StudentInfo();
                studentInfo.setSid(rs.getInt("sid"));
                studentInfo.setSname(rs.getString("sname"));
                studentInfo.setSgender(rs.getString("sgender"));
                studentInfo.setSage(rs.getInt("sage"));
                studentInfo.setSaddress(rs.getString("saddress"));
                studentInfo.setSemail(rs.getString("semail"));
                list.add(studentInfo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public StudentInfo selectById(Integer id) {
        String sql="select sid,sname,sgender,sage,saddress,semail from StudentInfo where sid=?";
        getConn();
        StudentInfo studentInfo=new StudentInfo();
        try {
            pata=conn.prepareStatement(sql);
            pata.setInt(1,id);
            rs=pata.executeQuery();
            while (rs.next()){
                studentInfo.setSid(rs.getInt("sid"));
                studentInfo.setSname(rs.getString("sname"));
                studentInfo.setSgender(rs.getString("sgender"));
                studentInfo.setSage(rs.getInt("sage"));
                studentInfo.setSaddress(rs.getString("saddress"));
                studentInfo.setSemail(rs.getString("semail"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return studentInfo;
    }

    @Override
    public int update(StudentInfo studentInfo) {
        String sql="\n" +
                "update studentInfo set sname=?,sgender=?,sage=?,saddress=?,seamil=?where sid=?;";
        Object[] objs={studentInfo.getSname(),studentInfo.getSgender(),studentInfo.getSage(),studentInfo.getSaddress(),studentInfo.getSemail(),studentInfo.getSid()};
        return executeUpdate(sql,objs);
    }
}
