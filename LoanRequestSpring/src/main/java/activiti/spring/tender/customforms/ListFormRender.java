/*package activiti.spring.tender.customforms;

import java.util.ArrayList;
import java.util.List;

import org.activiti.engine.form.FormProperty;
import org.activiti.engine.form.FormType;
import org.activiti.explorer.Messages;
import org.activiti.explorer.ui.form.AbstractFormPropertyRenderer;

import com.vaadin.ui.ComboBox;
import com.vaadin.ui.Field;

public class ListFormRender extends AbstractFormPropertyRenderer {

	public ListFormRender() {
		super(ListForm.class);
	}

	@Override
	public Field getPropertyField(FormProperty formProperty) {
		ComboBox comboBox = new ComboBox(getPropertyLabel(formProperty));
	    comboBox.setRequired(formProperty.isRequired());
	    comboBox.setRequiredError(getMessage(Messages.FORM_FIELD_REQUIRED, getPropertyLabel(formProperty)));
	    comboBox.setEnabled(formProperty.isWritable());
	    
	    List<String> Kandidati = new ArrayList<String>();
	    Kandidati.add("Pera");
	    Kandidati.add("Mita");
	    	 
	    	    for (String kandidat : Kandidati) {
	    	      comboBox.addItem(kandidat);
	    	    }
	    	 
	 
	    return comboBox;
	}

}
*/