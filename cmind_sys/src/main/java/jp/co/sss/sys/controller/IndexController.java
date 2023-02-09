package jp.co.sss.sys.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.sys.form.LoginForm;
import jp.co.sss.sys.repository.EmployeeRepository;

/**
 * コントローラークラス
 * @author Inoue Nami
 *
 */
@Controller
public class IndexController {

	@Autowired
	EmployeeRepository empRepository;
	
	@ModelAttribute
    LoginForm setUpForm() {
        return new LoginForm();
    }

	/**
	 * ログイン画面を表示する
	 * @param loginForm
	 * @return login.html
	 */
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String login(LoginForm loginForm) {
		return "login";
	}

	/**
	 * 入力された値を元にログイン認証し、トップ画面に遷移する
	 * @param loginForn
	 * @param req
	 * @param res
	 * @return top.html
	 */
	@RequestMapping(path = "/top", method = RequestMethod.POST)
	public String login(LoginForm loginForn, HttpServletRequest req, HttpServletResponse res) {
		/**
		//ログインID
	    String empId = LoginForm.getEmpId();

	    //パスワード
	    String password = LoginForm.getPassword();

	    
	    //ログインユーザー取得
	    Employee employee = empRepository.findByIdAndPass(empId, password);

	    //ログインチェック
	    if(employee == null) {
	      //存在しない場合
	      return "login";

	    }else {
	      //存在した場合
	      req.setAttribute("loginUser", loginForn);
	      */
		  return "top";
	   // }
    }
}
