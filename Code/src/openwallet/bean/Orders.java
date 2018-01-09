package openwallet.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.OrderBy;
import javax.persistence.Column;
import java.util.Date;
import java.util.Set;
import javax.persistence.Table;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.TreeSet;
import java.time.LocalDate;


@Entity
@Table(name = "Orders")
public class Orders {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "id_order")
  private int id_order;
  @OneToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
  private User user;
  private int code_order;
  private double total_price;
  private Address delivery_address;
  private Address invoice_address;
  private String user_message;
  private Date create_date_order;
  private Date pay_date;
  private Date delivery_date;
  private Date confirm_date;
  private String status;


  public Orders(){};

  public Orders(int id_order, User user, int code_order, double total_price, Address delivery_address, Address invoice_address, String user_message, Date create_date_order, Date pay_date, Date delivery_date, Date confirm_date, String status) {
      this.user = user;
      this.code_order = code_order;
      this.total_price = total_price;
      this.delivery_address = delivery_address;
      this.invoice_address = invoice_address;
      this.user_message = user_message;
      this.create_date_order = create_date_order;
      this.pay_date = pay_date;
      this.delivery_date = delivery_date;
      this.confirm_date = confirm_date;
      this.status = status;
  }

  public User getUser() {
  	  return this.user;
  }

  public void setUser(User user) {
  	  this.user = user;
  }

  public int getId_order() {
      return id_order;
  }

  public void setId_order(int id_order) {
      this.id_order = id_order;
  }

  public int getCode_order() {
      return code_order;
  }

  public void setCode_order(int code_order) {
      this.code_order = code_order;
  }

  public double getTotal_price() {
      return total_price;
  }

  public void setTotal_price(double total_price) {
      this.total_price = total_price;
  }

  public Address getDelivery_address() {
      return delivery_address;
  }

  public void setDelivery_address(Address delivery_address) {
      this.delivery_address = delivery_address;
  }

  public Address getInvoice_address() {
      return invoice_address;
  }

  public void setInvoice_address(Address invoice_address) {
      this.invoice_address = invoice_address;
  }

  public String getUser_message() {
      return user_message;
  }

  public void setUser_message(String user_message) {
      this.user_message = user_message;
  }

  public Date getCreate_date_order() {
      return create_date_order;
  }

  public void setCreate_date_order(Date create_date_order) {
      this.create_date_order = create_date_order;
  }

  public Date getPay_date() {
      return pay_date;
  }
  
  public void setPay_date(Date pay_date) {
      this.pay_date = pay_date;
  }

  public Date getDelivery_date() {
      return delivery_date;
  }

  public void setDelivery_date(Date delivery_date) {
      this.delivery_date = delivery_date;
  }

  public Date getConfirm_date() {
      return confirm_date;
  }

  public void setConfirm_date(Date confirm_date) {
      this.confirm_date = confirm_date;
  }

  public String getStatus() {
      return status;
  }

  public void setStatus(String status) {
      this.status = status;
  }
}
