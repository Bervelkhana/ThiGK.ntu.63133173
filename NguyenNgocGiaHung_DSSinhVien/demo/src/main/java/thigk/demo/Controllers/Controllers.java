package thigk.demo.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import thigk.demo.Models.SinhVien;

@Controller
public class Controllers {
    static List<SinhVien> dsSinhVien=  new ArrayList<SinhVien>();
	static {
			dsSinhVien.add(new SinhVien("0001", "Nguyễn Ngọc Gia Hưng","5.6"));
			dsSinhVien.add(new SinhVien("0002", "Huỳnh Minh Thư","7.3"));
			dsSinhVien.add(new SinhVien("0003", "Phạm Thu Trang","9.2"));
			dsSinhVien.add(new SinhVien("0004", "Nguyễn Bảo Hoàng","5.9"));
			dsSinhVien.add(new SinhVien("0005", "Phạm Ngọc Trang","7.0"));
			dsSinhVien.add(new SinhVien("0006", "Lê Ngọc Hoàng","6.0"));
			dsSinhVien.add(new SinhVien("0007", "Phạm Gia Huy","7.1"));
			dsSinhVien.add(new SinhVien("0008", "Nguyễn Ngọc Anh","8.1"));
			dsSinhVien.add(new SinhVien("0009", "Đào Thái Hùng","6.3"));
			dsSinhVien.add(new SinhVien("0010", "Nguyễn Ngọc Trang","7.2"));
		 }
	@GetMapping("/danhsach")
	public String listStudent(ModelMap mm) {
	    mm.addAttribute("dsSV", dsSinhVien);
	    return "Index.html";
	}
}

