package com.springcloudstream.consumer_2;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MySink {
    String INPUT_ADD = "input_add";

    String INPUT_DEL = "input_del";

    String INPUT_UPDATE = "input_update";

    @Input(INPUT_ADD)
    SubscribableChannel inputAdd();

    @Input(INPUT_DEL)
    SubscribableChannel inputDel();

    @Input(INPUT_UPDATE)
    SubscribableChannel inputUpdate();
}