package com.quemb.qmbform;

import android.app.Activity;

import com.quemb.qmbform.descriptor.RowDescriptor;
import com.quemb.qmbform.descriptor.Value;
import com.quemb.qmbform.view.FormIntegerSliderFieldCell;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by tonimoeckel on 02.09.14.
 */
@Config(constants = BuildConfig.class)
@RunWith(RobolectricGradleTestRunner.class)
public class FormIntegerSliderCellTest {


    private Activity activity;

    @Before
    public void setUp() {
        activity = Robolectric.buildActivity(Activity.class).create().get();
    }

    @Test
    public void shouldBeDisabled(){

        RowDescriptor<Integer> rowDescriptor = RowDescriptor.newInstance("integerSlider",RowDescriptor.FormRowDescriptorTypeIntegerSlider, "Integer Slider", new Value<Integer>(50));
        rowDescriptor.setDisabled(true);

        FormIntegerSliderFieldCell testCell = new FormIntegerSliderFieldCell(activity, rowDescriptor);

        assertThat(testCell.getSeekBar().isEnabled(), is(false));

    }

    @After
    public void tearDown() {

    }

}
