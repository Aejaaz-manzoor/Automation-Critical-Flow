package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpdeskPageobject extends LoginPageobjects {
	
	@FindBy (xpath = "//input[@class='form-control floating-input email']")
	public static WebElement Username ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[2]/div[3]/div[1]/input[1]")
	public static WebElement Password;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[2]/button[1]")
	public static WebElement Signin ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/div[1]/div[1]/div[1]/a[1]/img[1]")
	public static WebElement Vakilsearchlogo;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/input[2]")
	public static WebElement ticketid ;

	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[3]/span[1]/table[1]/tbody[1]/tr[1]/td[3]/div[2]/ul[1]/li[1]/a[1]")
	public static WebElement Firstservice ;
	
	@FindBy (xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/input[4]")
	public static WebElement Search ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
	public static WebElement CriticalnotesCTA ;
	
	@FindBy (xpath = "//button[@id='new_critical_note']")
	public static WebElement NewCriticalNoteCTA ;
	
	@FindBy (xpath = "(//iframe[@class='cke_wysiwyg_frame cke_reset'])[1]")
	public static WebElement TypeCriticalNotes ;
		
	@FindBy (xpath = "(//input[@name='ticket_message[ticket_attachments_attributes][][attachment]'])[1]")
	public static WebElement ChooseCriticalNoesFile ;
	
	@FindBy (xpath = "(//input[@class=\"btn rounded btn-success save_bulk_assignment\"])[1]")
	public static WebElement CriticalNoteSave ;
	
	@FindBy (xpath = "//form//input[@class='form-control input SwapDivsWithClick']")
	public static WebElement addnote ;
	
	@FindBy (xpath = "(//iframe[@class='cke_wysiwyg_frame cke_reset'])[4]")
	public static WebElement typeaddnote ;
	
	@FindBy (xpath = "(//input[@name='ticket_message[ticket_attachments_attributes][][attachment]'])[3]")
	public static WebElement addnoteattachment ;
	
	@FindBy (xpath = "//button[@class='btn btn-default mailSendBtn add_note_submit_button']")
	public static WebElement addnotesend ;
	
	@FindBy (xpath = "//span[@id='select2-add_note_to-container']")
	public static WebElement EmailTo ;
		
	@FindBy (xpath = "(//div[@class='cke_contents cke_reset'])[4]")
	public static WebElement Emailtoaddnote ;
	
	@FindBy (xpath = "(//input[@name='ticket_message[ticket_attachments_attributes][][attachment]'])[3]")
	public static WebElement EmailAddAttachment ;
	
	@FindBy (xpath = "//button[@class='btn btn-default mailSendBtn add_note_submit_button']")
	public static WebElement EmailButtonSend ;
	
	//******Canned Response with attachment*******
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[7]/div[1]/span[1]")
	public static WebElement MenuDownArrow ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[7]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/p[1]/a[1]")
	public static WebElement CannedResponseCTA ;
	
	@FindBy (xpath = "//a[@class='nav-link canned_response_folder_select active']")
	public static WebElement cannedaddingadirector ;
	
	@FindBy (xpath = "(//*[contains(text(),'Adding a Director')])[1]")
	public static WebElement cannedaddingadirector1 ;
	
	@FindBy (xpath = "//*[contains(text(),'FINAL EMAIL')]")
	public static WebElement cannedFollowingEmail1 ;
	
	@FindBy (xpath = "(//a[@class='email-tempalte-object template_object_new'])[2]")
	public static WebElement cannedFollowingEmail ;
	
	@FindBy (xpath = "(//input[@name='ticket_message[ticket_attachments_attributes][][attachment]'])[2]")
	public static WebElement cannedEmailaddattachment ;
	
	@FindBy (xpath = "//button[@id='take_action_submit_button']")
	public static WebElement cannedupdateCTA ;
	
	@FindBy (xpath = "//input[@id='name']")
	public static WebElement cannedsubject ;
	
	@FindBy (xpath = "(//td[@data-date='29'])[2]")
	public static WebElement cannedDate30 ;
	
	@FindBy (xpath = "//input[@class='event_reminder_from_time_date']")
	public static WebElement cannedselectdate ;
	
	@FindBy (xpath = "//textarea[@id='description']")
	public static WebElement cannedDescription ;

	@FindBy (xpath = "(//input[@type='checkbox'])[9]")
	public static WebElement EventCheckbox ;
	
	@FindBy (xpath = "//a[@id='load_quotation']")
	public static WebElement CreatenewQuotation ;
	
	@FindBy (xpath = "(//*[contains(text(),'Create Quotation')])[1]")
	public static WebElement CreateQuotation ;
	
	@FindBy (xpath = "(//a[@data-toggle='tab'])[1]")
	public static WebElement QIndividual ;
	
	@FindBy (xpath = "(//div[@class='name']//child::input)[1]")
	public static WebElement QNameofthecustomer ;
	
	@FindBy (xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/textarea[1]")
	public static WebElement Qaddress ;
	
	@FindBy (xpath = "/html[1]/body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/input[1]")
	public static WebElement Qpincode ;
	
	@FindBy (xpath = "//select[@class='width-100 part_payment_value']")
	public static WebElement PaymentType ;
	
	@FindBy (xpath = "//select[@class='width-100 part_payment_value']")
	public static WebElement ProfessionalFees ;
	
	@FindBy (xpath = "//a[@class='send confirm_value']")
	public static WebElement Confirmquotation ;
	
	@FindBy (xpath = "//a[@class='send']")
	public static WebElement ConfirmquotationEdit ;
	
	@FindBy (xpath = "//a[@class='send confirm_send']")
	public static WebElement sendquotation ;
	
	@FindBy (xpath = "//input[@class='send quotation_send']")
	public static WebElement sendquotationedit ;

	@FindBy (xpath = "//a[@title='Edit']//i[@class='glyphicon glyphicon-pencil']")
	public static WebElement editquoation ;
	
	@FindBy (xpath = "//a[@class='send confirm_send']")
	public static WebElement QEditQyes ;
	
	@FindBy (xpath = "//a[@value='yes']")
	public static WebElement DeactivateYES ;
	
	@FindBy (xpath = "//i[@class='glyphicon glyphicon-share']")
	public static WebElement Generatequotation ;
	
	@FindBy (xpath = "//i[@class='glyphicon glyphicon-ban-circle']")
	public static WebElement deactivateQuotation ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[8]/a[1]/i[1]")
	public static WebElement CrosssaleCTA ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/div[5]/div[1]/div[1]/div[2]/form[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")
	public static WebElement Selectcrosssale ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/div[5]/div[1]/div[1]/div[2]/form[1]/div[1]/button[1]")
	public static WebElement Createcrosssale ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/a[1]/i[1]")
	public static WebElement RecentTickets ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[7]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/ul[1]/li[1]/u[1]/a[1]")
	public static WebElement Firstrescentticket ;
	
	@FindBy (xpath = "//h2[@style='margin-top: 6px;']")
	public static WebElement recentTicketID ;
	
	@FindBy (xpath = "(//div[@class='col-md-8']/child::ul/child::li/child::u)[1]")
	public static WebElement Recenetfirstticket ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/a[1]")
	public static WebElement Merge ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]/input[1]")
	public static WebElement mergesearchticketId ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/span[1]/span[1]/ul[1]/li[1]")
	public static WebElement mergesearchticketId1 ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
	public static WebElement mergeSecondcheckbox ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/div[1]/div[2]/div[2]/button[2]")
	public static WebElement mergesavechanges ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/div[3]/div[5]/div[1]/p[1]/button[1]")
	public static WebElement LoadmoreMessagesCTA ;
	
	@FindBy (xpath = "//button[@id='editBtn']")
	public static WebElement Editticket ;
	
	@FindBy (xpath = "//span[@id='select2-assigned_to_handover-container']")
	public static WebElement Assignedto ;
	
	@FindBy (xpath = "//span[@class='select2-search select2-search--dropdown']//input[@role='searchbox']")
	public static WebElement Assignedtoname;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/dl[1]/dd[6]/span[1]/span[1]/span[1]/span[1]")
	public static WebElement source ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/dl[1]/dd[7]/input[1]")
	public static WebElement Medium ;
	
	
	@FindBy (xpath = "//span[@id='select2-ticket_bd_agent_id-container']")
	public static WebElement BDagentCTA ;
	
	@FindBy (xpath = "//span[@class='select2-search select2-search--dropdown']//input[@role='searchbox']")
	public static WebElement BDagentsearch ;
	
	@FindBy (xpath = "//input[@class='btn btn-primary helpdesk_ticket_class']")
	public static WebElement Updateticket ;
	
	@FindBy (xpath = "(//input[@class='form-control'])[3]")
	public static WebElement MagickeyUrl ;
	
	@FindBy (xpath = "//button[@id='copyurl']")
	public static WebElement Magickeycopy ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[8]/a[1]")
	public static WebElement AgentDashboard ;
	
	@FindBy (xpath = "//a[normalize-space()='Customer Dashboard']")
	public static WebElement CustomerDashboard ;
	
	@FindBy (xpath = "//a[normalize-space()='GRC']")
	public static WebElement GRCCTA ;
	
	@FindBy (xpath = "/html[1]/body[1]/section[1]/section[1]/section[1]/header[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")
	public static WebElement PersonalNote ;
	
	@FindBy (xpath = "(//button[@class='btn rounded btn-success pull-right'])[2]")
	public static WebElement NewPersonalNote ;
	
	@FindBy (xpath = "(//iframe[@class='cke_wysiwyg_frame cke_reset'])[2]")
	public static WebElement TypePersonalnote ;
	
	@FindBy (xpath = "(//input[@class='btn rounded btn-success save_bulk_assignment'])[2]")
	public static WebElement savepersonalnote ;
	
	@FindBy (xpath = "/html[1]/body[1]/span[3]/span[1]/span[1]/input[1]")
	public static WebElement emailsearchTo ;
	
	@FindBy (xpath = "//a[@class='nav-link canned_response_folder_select active']")
	public static WebElement cannedAddingaDriector ;
	
	@FindBy (xpath = "//a[contains(text(),'HelpDesk ')]")
	public static WebElement Helpdesk ;
	
	@FindBy (xpath = "(//div//ul[@class='dropdown-menu']//li//*[contains(text(),'Tickets')])[1]")
	public static WebElement Tickets ;
	
	@FindBy (xpath = "//span[contains(text(),'Please select payment status')]")
	public static WebElement  Paymentstatus;
	
	@FindBy (xpath = "//a[contains(text(),'Entity Info')]")
	public static WebElement  EntityInfo;
	
	@FindBy (xpath = "//h4//b[contains(text(),'Change Entity')]")
	public static WebElement  ChangeEntity;
	
	@FindBy (xpath = "(//div[@class='row field_box_form']/child::div/child::select)[3]")
	public static WebElement  selectBusiness;
	
	@FindBy (xpath = "((//div[@class='row field_box_form']/child::div/child::select)[3]/child::option)[1]")
	public static WebElement  FirstEntity;
	
	@FindBy (xpath = "(//div//button[contains(text(),'Save')])[3]")
	public static WebElement  SaveEntity;
	
	@FindBy (xpath = "//select[@class='status form-control']")
	public static WebElement  VerifyTheEntity;
	
	@FindBy (xpath = "(//button[contains(text(),'Save')])[2]")
	public static WebElement  SaveEntity2;
	
	@FindBy (xpath = "(//ul[@class='select2-selection__rendered']/child::li[@class='select2-search select2-search--inline'])[2]")
	public static WebElement  employtonotify;

	@FindBy (xpath = "(//div[@class='panel-collapse collapse1']/child::div/child::p)[2]")
	public static WebElement  RecentNoteVerification;
	
	@FindBy (xpath = "(//div[@class='panel-collapse collapse1']/child::div)[2]/child::p/child::span")
	public static WebElement  Viewattachment;
	
	@FindBy (xpath = "(//span[contains(text(),'To')]/parent::span)[4]")
	public static WebElement  addnoteTo;
	
	
	
}
