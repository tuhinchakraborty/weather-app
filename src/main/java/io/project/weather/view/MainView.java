package io.project.weather.view;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@Theme(value = Lumo.class, variant = Lumo.DARK)
@Route
public class MainView extends VerticalLayout {
	public MainView() {
		add(new TextField("City"));
		add(new Button("Submit", event -> Notification.show("Button was clicked")));
	}
}
