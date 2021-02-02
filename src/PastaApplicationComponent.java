import com.intellij.ide.ui.LafManager;

import javax.swing.*;

public class PastaApplicationComponent {
    public PastaApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", PastaProgressBarUi.class.getName());
        UIManager.getDefaults().put(PastaProgressBarUi.class.getName(), PastaProgressBarUi.class);
    }
}
